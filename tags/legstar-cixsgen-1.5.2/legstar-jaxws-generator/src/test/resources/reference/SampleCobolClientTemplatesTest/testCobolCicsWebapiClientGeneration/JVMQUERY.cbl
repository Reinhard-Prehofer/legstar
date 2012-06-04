       PROCESS XOPTS(APOST)
       PROCESS NOSEQ LIB OPTIMIZE(FULL)
       IDENTIFICATION DIVISION.
       PROGRAM-ID. JVMQUERY.
      *****************************************************************
      * OVERVIEW                                                      *
      * --------                                                      *
      * Sample transaction calling a remote service using WEB API.    *
      * The WEB API is available since TS 3.1 and replaces DFHWBCLI.  *
      * The HTTP body contains raw mainframe data. It is expected     *
      * that the receiver will use LegStar COBOL binding to convert   *
      * payload to a Java object.                                     *
      *                                                               *
      * Program generated by LegStar Mainframe to Jaxws generator.    *
      * Follow the TODO markers to customize this program.            *
      *****************************************************************

       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       DATA DIVISION.
      *****************************************************************
      *        W O R K I N G    S T O R A G E    S E C T I O N        *
      *****************************************************************
       WORKING-STORAGE SECTION.
       
      *---------------------------------------------------------------*
      *  Constants                                                    *
      *---------------------------------------------------------------*
       77  W00-SERVICE-URI PIC X(57) VALUE 
           'http://192.168.0.112:8080/c2ws-jvmqueryWs/jvmqueryWsProxy'.


      *---------------------------------------------------------------*
      *  CICS API parameters                                          *
      *---------------------------------------------------------------*
       01  W03-RESP                      PIC S9(9) BINARY VALUE 0.
       01  W03-RESP2                     PIC S9(9) BINARY VALUE 0.
      *
      * EXEC CICS WEB API
      *
       01  WAPI-ARGS.
           05 WAPI-URL                    PIC X(256).
           05 WAPI-URLLENGTH              PIC 9(9) BINARY.                
           05 WAPI-SCHEMENAME             PIC X(16).
           05 WAPI-SCHEME                 PIC 9(9) BINARY.
           05 WAPI-PORTNUMBER             PIC 9(9) BINARY.
           05 WAPI-HOST                   PIC X(256).
           05 WAPI-HOSTLENGTH             PIC 9(9) BINARY.                
           05 WAPI-PATH                   PIC X(256).
           05 WAPI-PATHLENGTH             PIC 9(9) BINARY.                
           05 WAPI-QUERYSTRING            PIC X(256).
           05 WAPI-QUERYSTRLEN            PIC 9(9) BINARY.  
           05 WAPI-SESSTOKEN              PIC X(8).                        
           05 WAPI-MEDIATYPE              PIC X(56).                        
           05 WAPI-STATUSCODE             PIC 9(4) BINARY.
           05 WAPI-TOLENGTH               PIC 9(9) BINARY.  
           05 WAPI-STATUSTEXT             PIC X(256).
           05 WAPI-STATUSLEN              PIC 9(9) BINARY.                

      *---------------------------------------------------------------*
      *  Work variables                                               *
      *---------------------------------------------------------------*
       01  ERROR-MESSAGE                  PIC X(78) VALUE SPACES.
           88 NO-ERROR-MESSAGE VALUE SPACES.

       01  WS-I                           PIC S9(9) BINARY VALUE ZERO.
       01  WS-DOUBLE-CHAR.
           05  FILLER                     PIC X VALUE LOW-VALUES.
           05  WS-CHAR                    PIC X.
       01  WS-NUM REDEFINES WS-DOUBLE-CHAR PIC 9(4) COMP-5.

      *---------------------------------------------------------------*
      *  Poor man's ASCII to EBCDIC table used to interpret error     *
      *  messages only. Enterprise COBOL users should use DISPLAY-OF. *
      *---------------------------------------------------------------*
       01  W00-ASCII-2-EBCDIC-CHARS.
           05 FILLER                      PIC X(128) VALUE
                                      X'00010203372D2E2F1605250B0C0D0E0F
      -                                '101112133C3D322618193F27221D351F
      -                                '405A7F7B5B6C507D4D5D5C4E6B604B61
      -                                'F0F1F2F3F4F5F6F7F8F97A5E4C7E6E6F
      -                                '7CC1C2C3C4C5C6C7C8C9D1D2D3D4D5D6
      -                                'D7D8D9E2E3E4E5E6E7E8E9ADE0BD5F6D
      -                                '79818283848586878889919293949596
      -                                '979899A2A3A4A5A6A7A8A9C04FD0A107
      -                                ''.
           05 FILLER                      PIC X(128) VALUE
                                      X'00010203372D2E2F1605250B0C0D0E0F
      -                                '101112133C3D322618193F27221D351F
      -                                '405A7F7B5B6C507D4D5D5C4E6B604B61
      -                                'F0F1F2F3F4F5F6F7F8F97A5E4C7E6E6F
      -                                '7CC1C2C3C4C5C6C7C8C9D1D2D3D4D5D6
      -                                'D7D8D9E2E3E4E5E6E7E8E9ADE0BD5F6D
      -                                '79818283848586878889919293949596
      -                                '979899A2A3A4A5A6A7A8A9C04FD0A107
      -                                ''.
       01  FILLER REDEFINES W00-ASCII-2-EBCDIC-CHARS.
           05  W00-ASCII-2-EBCDIC         PIC X OCCURS 256 .

      *---------------------------------------------------------------*
      *  Request parameters expected by target web service            *
      *---------------------------------------------------------------*
       01 COM-REQUEST.
           02  QueryJvm.
             03  envVarNames--C PIC 9(9) BINARY.
             03  arg0.
               04  envVarNames OCCURS 0 TO 10 DEPENDING ON 
                   envVarNames--C PIC X(32) DISPLAY.

       
      *****************************************************************
      *            L I N K A G E       S E C T I O N                  *
      *****************************************************************
       LINKAGE SECTION.

      *---------------------------------------------------------------*
      *  Reply parameters as returned by target web service           *
      *---------------------------------------------------------------*
       01 COM-REPLY.
           02  QueryJvmResponse.
             03  envVarValues--C PIC 9(9) BINARY.
             03  R-return.
               04  country PIC X(32) DISPLAY.
               04  currencySymbol PIC X(32) DISPLAY.
               04  envVarValues OCCURS 0 TO 10 DEPENDING ON 
                   envVarValues--C PIC X(32) DISPLAY.
               04  formattedDate PIC X(32) DISPLAY.
               04  language PIC X(32) DISPLAY.

               
      *****************************************************************
      *    P R O C E D U R E  D I V I S I O N   S E C T I O N         *
      *****************************************************************
       PROCEDURE DIVISION.

           PERFORM PROLOG THRU
               END-PROLOG.

           PERFORM INVOKE-SERVICE THRU
               END-INVOKE-SERVICE.
               
           PERFORM EPILOG THRU
               END-EPILOG.

           GOBACK.
       
      *---------------------------------------------------------------*
      *  Parse URL and Open a connection to the host                  *
      *---------------------------------------------------------------*
       PROLOG.

           DISPLAY
               'JVMQUERY STARTING ==============================='. 

           PERFORM SET-REQUEST THRU
               END-SET-REQUEST.

           MOVE LOW-VALUES TO WAPI-ARGS.
           COMPUTE WAPI-HOSTLENGTH = LENGTH OF WAPI-HOST.
           COMPUTE WAPI-PATHLENGTH = LENGTH OF WAPI-PATH.
           COMPUTE WAPI-QUERYSTRLEN = LENGTH OF WAPI-QUERYSTRING.
           
           EXEC CICS WEB PARSE
                URL               (W00-SERVICE-URI)
                URLLENGTH         (LENGTH OF W00-SERVICE-URI)
                SCHEMENAME        (WAPI-SCHEMENAME)
                HOST              (WAPI-HOST)
                HOSTLENGTH        (WAPI-HOSTLENGTH)
                PORTNUMBER        (WAPI-PORTNUMBER)
                PATH              (WAPI-PATH)
                PATHLENGTH        (WAPI-PATHLENGTH)
                QUERYSTRING       (WAPI-QUERYSTRING)
                QUERYSTRLEN       (WAPI-QUERYSTRLEN)
                RESP              (W03-RESP)
                RESP2             (W03-RESP2)
           END-EXEC.
           
           IF (W03-RESP NOT = DFHRESP(NORMAL))
               MOVE 'EXEC CICS WEB PARSE FAILED' TO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY '==========================================='.
           DISPLAY 'OPEN PARAMETERS PASSED :'.
           DISPLAY '   HOST        - ', WAPI-HOST(1:WAPI-HOSTLENGTH).
           DISPLAY '   PORTNUMBER  - ', WAPI-PORTNUMBER.
           DISPLAY '   SCHEME      - ', WAPI-SCHEMENAME.
           DISPLAY '==========================================='.
           
           EVALUATE WAPI-SCHEMENAME
               WHEN 'HTTP'
                    MOVE DFHVALUE(HTTP) TO WAPI-SCHEME
               WHEN 'HTTPS'
                    MOVE DFHVALUE(HTTPS) TO WAPI-SCHEME
           END-EVALUATE.
           
           EXEC CICS WEB OPEN
                HOST              (WAPI-HOST)
                HOSTLENGTH        (WAPI-HOSTLENGTH)
                PORTNUMBER        (WAPI-PORTNUMBER)
                SCHEME            (WAPI-SCHEME)
                SESSTOKEN         (WAPI-SESSTOKEN)
                RESP              (W03-RESP)
                RESP2             (W03-RESP2)
           END-EXEC.
           
           IF (W03-RESP NOT = DFHRESP(NORMAL))
               STRING 'EXEC CICS WEB OPEN FAILED FOR SERVICE AT '
                      W00-SERVICE-URI
                      DELIMITED BY SIZE INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY 'PROLOG ENDED'.
           
       END-PROLOG.   EXIT.

      *---------------------------------------------------------------*
      *  Populate the request parameters                              *
      *---------------------------------------------------------------*
       SET-REQUEST.

           DISPLAY 'SET-REQUEST STARTED'.

      *  TODO set input values in COM-REQUEST                         *
           
           DISPLAY 'SET-REQUEST ENDED'.

       END-SET-REQUEST.   EXIT.

      *---------------------------------------------------------------*
      *  Invoke target service and analyze response                   *
      *---------------------------------------------------------------*
       INVOKE-SERVICE.

           DISPLAY 'ABOUT TO INVOKE-SERVICE'.

           MOVE 'application/octet-stream' TO WAPI-MEDIATYPE.
           COMPUTE WAPI-STATUSLEN = LENGTH OF WAPI-STATUSTEXT.

           EXEC CICS WEB CONVERSE
                SESSTOKEN         (WAPI-SESSTOKEN)
                PATH              (WAPI-PATH)
                PATHLENGTH        (WAPI-PATHLENGTH)
                METHOD            (DFHVALUE(POST))
                MEDIATYPE         (WAPI-MEDIATYPE)
                CLIENTCONV        (DFHVALUE(NOCLICONVERT))
                FROM              (COM-REQUEST)
                FROMLENGTH        (LENGTH OF COM-REQUEST)
                SET               (ADDRESS OF COM-REPLY)
                TOLENGTH          (WAPI-TOLENGTH)
                NOTRUNCATE
                STATUSCODE        (WAPI-STATUSCODE)
                STATUSTEXT        (WAPI-STATUSTEXT)
                STATUSLEN         (WAPI-STATUSLEN)
                RESP              (W03-RESP)
                RESP2             (W03-RESP2)
           END-EXEC.
           
           IF (W03-RESP NOT = DFHRESP(NORMAL))
               MOVE 'EXEC CICS WEB CONVERSE FAILED' TO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           EVALUATE WAPI-STATUSCODE
               WHEN 200
                   IF WAPI-TOLENGTH NOT > ZERO
                       MOVE 'EMPTY RESPONSE BODY' TO ERROR-MESSAGE
                   END-IF
               WHEN ZERO
                   MOVE  'POSSIBLE SERVER TIMEOUT'  TO ERROR-MESSAGE
               WHEN OTHER
                   IF (WAPI-TOLENGTH > ZERO AND
                       WAPI-MEDIATYPE = 'text/html')
                       PERFORM CONVERT-REPLY THRU
                           END-CONVERT-REPLY
                       MOVE COM-REPLY(1:WAPI-TOLENGTH)
                         TO ERROR-MESSAGE
                   ELSE
                       STRING  'HTTP ERROR='
                                WAPI-STATUSTEXT(1:WAPI-STATUSLEN)
                                DELIMITED BY SIZE
                                INTO ERROR-MESSAGE
                   END-IF
           END-EVALUATE.
           
           IF NO-ERROR-MESSAGE 
               PERFORM PRINT-RESULTS THRU
                   END-PRINT-RESULTS
           ELSE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF

           DISPLAY 'INVOKE-SERVICE SUCCESS'.

       END-INVOKE-SERVICE.   EXIT.

      *---------------------------------------------------------------*
      *  Display results returned from target service                 *
      *---------------------------------------------------------------*
       PRINT-RESULTS.

      *  TODO do something useful with data returned in  COM-REPLY    *

       END-PRINT-RESULTS.   EXIT.

      *---------------------------------------------------------------*
      *  Close connection and terminate program.                      *
      *---------------------------------------------------------------*
       EPILOG.

           EXEC CICS WEB CLOSE
                SESSTOKEN         (WAPI-SESSTOKEN)
                RESP              (W03-RESP)
                RESP2             (W03-RESP2)
           END-EXEC.

           PERFORM EXIT-PROGRAM THRU
               END-EXIT-PROGRAM.
           
       END-EPILOG.   EXIT.

      *---------------------------------------------------------------*
      *  Entity body might contain error messages assumed to be       *
      *  encoded in ASCII. This simplistic routine converts the       *
      *  content into EBCDIC. Conversion is inplace.                  *
      *---------------------------------------------------------------*
       CONVERT-REPLY.
       
           DISPLAY 'CONVERT-REPLY STARTED'.
           
           PERFORM VARYING WS-I FROM 1 BY 1
                     UNTIL WS-I > WAPI-TOLENGTH
               MOVE COM-REPLY(WS-I:1) TO WS-CHAR
               IF (WS-NUM < 256)
                   MOVE W00-ASCII-2-EBCDIC(WS-NUM + 1)
                     TO COM-REPLY(WS-I:1)
               ELSE
                   MOVE '?' TO COM-REPLY(WS-I:1)
               END-IF
           END-PERFORM.
           
           DISPLAY 'CONVERT-REPLY ENDED'.

       END-CONVERT-REPLY.   EXIT.

      *---------------------------------------------------------------*
      *  Free keyboard and return to CICS                             *
      *---------------------------------------------------------------*
       EXIT-PROGRAM.
       
           EXEC CICS SEND CONTROL FREEKB END-EXEC.
           
           DISPLAY 'JVMQUERY STOPPING ==============================='.
           EXEC CICS RETURN END-EXEC.

       END-EXIT-PROGRAM.   EXIT.

      *---------------------------------------------------------------*
      *  Something went wrong. Report error and exit.                 *
      *---------------------------------------------------------------*
       ABORT-PROGRAM.
           
           PERFORM DISPLAY-ERROR-MESSAGE THRU
               END-DISPLAY-ERROR-MESSAGE.
               
           PERFORM EXIT-PROGRAM THRU
               END-EXIT-PROGRAM.

       END-ABORT-PROGRAM.   EXIT.

      *---------------------------------------------------------------*
      *  Display error messages                                       *
      *---------------------------------------------------------------*
       DISPLAY-ERROR-MESSAGE.

           EXEC CICS SEND TEXT FROM(ERROR-MESSAGE) FREEKB END-EXEC. 
           DISPLAY '************************************************'.
           DISPLAY '* ', ERROR-MESSAGE.
           DISPLAY '* COMPLETION CODE : ', W03-RESP.
           DISPLAY '* REASON CODE     : ', W03-RESP2.
           DISPLAY '************************************************'.

       END-DISPLAY-ERROR-MESSAGE.   EXIT.
       
       END PROGRAM JVMQUERY.
