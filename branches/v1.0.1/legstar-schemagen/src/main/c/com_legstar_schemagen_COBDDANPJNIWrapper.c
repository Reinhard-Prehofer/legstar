/* This is a JNI wrapper for the Cobol datatype detection DLL COBDDAnalyze */
/* It is mainly a bridge converting parameter sets from JNI to straight C  */
#include <stdio.h>
#include "COBDDPAS.H"
#include "COBDDANM.H"
#include "com_legstar_schemagen_COBDDANPJNIWrapper.h"   // this header file was generated by javah
#include "com_legstar_schemagen_UTILJNIWrapper.h" /* Utility method prototypes */


JNIEXPORT jint JNICALL Java_com_legstar_schemagen_COBDDANPJNIWrapper_anapict
  (JNIEnv  *env, jobject obj, jobject inVars, jobject outVars)
{
	char* sUsage = NULL;
	char  soUsage[MAX_USAGE_LEN];
	char* sPicture =  NULL;
	int iSignSeparate =  FALSE;
	char sMessage[256];
	COBOL_COMPILER_OPTIONS cobol_options;
	int  rc, totalDigits, fractionDigits, sign, byteLength;
	enum DATATYPE dataType;
	int _debugMode;

	sMessage[0] = '\0';
	
	/* Initialize compiler options */
	cobol_options.include_debug_lines = FALSE; /* 1 = DEBUG lines are to be parsed      */
	cobol_options.trunc_bin = FALSE;      /* 1 = TRUNC(BIN) option is in effect         */
	cobol_options.currency_sign = '$';  /* The currency symbol used in numerics         */
	cobol_options.decimal_point_is_comma = FALSE; /* 1= Comma is the decimal separator  */
	cobol_options.nsymbol_dbcs = FALSE;   /* The NSYMBOL(DBCS) option is in effect      */
	cobol_options.quote = FALSE;          /* 1 = QUOTE option in effect otherwise APOST */
	
	/* Convert Java types to native types */
	if (JNI_OK != JNU_SetNativeIntFromBoolean(env, inVars, "debugMode", &_debugMode)) return JNI_ERR;
	if (JNI_OK != JNU_SetNativeIntFromBoolean(env, inVars, "signSeparate", &iSignSeparate)) return JNI_ERR;
	if (JNI_OK != JNU_GetNativeCharsFromString(env, inVars, "usage", &sUsage)) return JNI_ERR;
	if (JNI_OK != JNU_GetNativeCharsFromString(env, inVars, "picture", &sPicture)) return JNI_ERR;
	
	/* COBDDAnalyze might change the value of USAGE. This happens for DBCS items when
	 * no USAGE was specified). Therefore we let the DLL work on a copy of the input. */
	strcpy(soUsage,sUsage); 

	/* Call the native DLL entry */
  	rc = COBDDAnalyze(
           _debugMode,         /* 1= Debug traces in stdout         */
           &cobol_options,     /* Input options in effect           */
           soUsage,            /* Input Cobol usage clause          */
           sPicture,           /* Input Cobol picture clause        */
           &iSignSeparate,     /* Input Is sign separated. This has
                                 an influence on zoned decimal byte
                                 length.                            */
           &dataType,          /* Output Data item type 
                                derived from picture clause         */
           &totalDigits,       /* Output total number of digits     */
           &fractionDigits,    /* Output fractional digits          */
           &sign,              /* Output sign                       */
           &byteLength,        /* Total length of item in bytes     */
           sMessage);          /* Error message if any              */

    
	/* Create the output variables  */
 	if (JNI_OK != JNU_SetIntegerFromNativeInt(env, outVars, "dataType", (int)dataType)) return JNI_ERR;
 	if (JNI_OK != JNU_SetIntegerFromNativeInt(env, outVars, "totalDigits", totalDigits)) return JNI_ERR;
 	if (JNI_OK != JNU_SetIntegerFromNativeInt(env, outVars, "fractionDigits", fractionDigits)) return JNI_ERR;
 	if (JNI_OK != JNU_SetIntegerFromNativeInt(env, outVars, "sign", sign)) return JNI_ERR;
 	if (JNI_OK != JNU_SetIntegerFromNativeInt(env, outVars, "byteLength", byteLength)) return JNI_ERR;
 	if (JNI_OK != JNU_SetStringFromNativeChars(env, outVars, "message", sMessage)) return JNI_ERR;

 	/* Update USAGE value */
 	if (JNI_OK != JNU_SetStringFromNativeChars(env, inVars, "usage", soUsage)) return JNI_ERR;

	/* Must release memory used  */
	free(sUsage);
	free(sPicture);
	
	return rc;
}
