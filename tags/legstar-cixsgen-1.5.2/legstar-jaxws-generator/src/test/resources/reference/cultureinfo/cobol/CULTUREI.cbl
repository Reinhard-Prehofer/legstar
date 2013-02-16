       PROCESS XOPTS(APOST)
       PROCESS NOSEQ LIB OPTIMIZE(FULL)
       IDENTIFICATION DIVISION.
       PROGRAM-ID. CULTUREI.
      *****************************************************************
      * OVERVIEW                                                      *
      * --------                                                      *
      * Sample transaction calling a remote service using DFHWBCLI    *
      * DFHWBCLI is the Web Client Interface available since TS 2.3   *
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
       77  W00-SERVICE-URI PIC X(59) VALUE 'http://192.168.0.112:8080/c2
      -    'ws-cultureinfo/cultureinfoProxy'.


      *---------------------------------------------------------------*
      *  CICS API parameters                                          *
      *---------------------------------------------------------------*
       01  W03-RESP                      PIC S9(9) BINARY VALUE 0.
       01  W03-RESP2                     PIC S9(9) BINARY VALUE 0.
      *
      * DFHWBCLI Commarea layout (hlq.CICS.SDFHCOB)
      *
          COPY DFHWBCLO.    

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
           02  GetInfo.
             03  arg0.
               04  cultureCode PIC X(32) DISPLAY.
               04  decimalNumber PIC 9(7)V9(2) COMP-3.

       
      *****************************************************************
      *            L I N K A G E       S E C T I O N                  *
      *****************************************************************
       LINKAGE SECTION.

      *---------------------------------------------------------------*
      *  Reply parameters as returned by target web service           *
      *---------------------------------------------------------------*
       01 COM-REPLY.
           02  GetInfoResponse.
             03  R-return.
               04  currencySymbol PIC X(32) DISPLAY.
               04  displayCountry PIC X(32) DISPLAY.
               04  displayLanguage PIC X(32) DISPLAY.
               04  formattedDate PIC X(32) DISPLAY.
               04  formattedDecimalNumber PIC X(32) DISPLAY.
               04  serverCultureInfo.
                 05  cultureCode PIC X(32) DISPLAY.
                 05  displayCountry0 PIC X(32) DISPLAY.
                 05  displayLanguage0 PIC X(32) DISPLAY.

               
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
      *  Initialize the DFHWBCLI commarea.                            *
      *---------------------------------------------------------------*
       PROLOG.

           DISPLAY
               'CULTUREI STARTING ==============================='. 

           PERFORM SET-REQUEST THRU
               END-SET-REQUEST.

           MOVE LOW-VALUES TO DFHWBCLI-ARG.
           
           MOVE WBCLI-VERSION-CURRENT TO WBCLI-VERSION-NO.
           MOVE WBCLI-FUNCTION-CONVERSE TO WBCLI-FUNCTION.
           MOVE WBCLI-METHOD-POST TO WBCLI-METHOD.
      *
      * Send/Receive native data (no conversion)
      *
           MOVE X'13' TO WBCLI-FLAGS.
           SET WBCLI-URL-PTR TO ADDRESS OF W00-SERVICE-URI.
           COMPUTE WBCLI-URL-LEN = LENGTH OF W00-SERVICE-URI.
           SET WBCLI-REQUEST-BODY-PTR TO ADDRESS OF COM-REQUEST.
           COMPUTE WBCLI-REQUEST-BODY-LEN =
               LENGTH OF COM-REQUEST.
           MOVE 'application/octet-stream' TO WBCLI-MEDIATYPE.

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

           EXEC CICS LINK PROGRAM('DFHWBCLI')
                COMMAREA (DFHWBCLI-ARG)
                RESP     (W03-RESP)
                RESP2    (W03-RESP2)
           END-EXEC.
           
      * 
      * Maybe group DFHWEB is not installed in CICS...
      *
           IF (W03-RESP NOT = DFHRESP(NORMAL))
               MOVE 'LINK DFHWBCLI FAILED' TO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

      * 
      * Examine DFHWBCLI own return code. Exceptions are usually
      * timeouts while trying to connect to service
      *
           MOVE WBCLI-RESPONSE TO W03-RESP.
           MOVE WBCLI-REASON   TO W03-RESP2.

           IF (W03-RESP = WBCLI-RESPONSE-DISASTER) OR
              (W03-RESP = WBCLI-RESPONSE-EXCEPTION AND
               W03-RESP2 NOT = WBCLI-REASON-HTTP-ERROR)
               STRING 'DFHWBCLI FAILED TO RUN SERVICE AT '
                      W00-SERVICE-URI
                      DELIMITED BY SIZE INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.
           
      * 
      * Only accept an HTTP 200 with some content otherwise
      * try to get a human readable error message from the server
      *
           EVALUATE WBCLI-HTTP-STATUS-CODE
               WHEN '200'
                   IF WBCLI-RESPONSE-BODY-LEN NOT > ZERO
                       MOVE 'EMPTY RESPONSE BODY' TO ERROR-MESSAGE
                   ELSE
                       SET ADDRESS OF COM-REPLY
                        TO WBCLI-RESPONSE-BODY-PTR
                   END-IF
               WHEN OTHER
                   IF (WBCLI-RESPONSE-BODY-LEN > ZERO AND
                       WBCLI-MEDIATYPE = 'text/html')
                       PERFORM CONVERT-REPLY THRU
                           END-CONVERT-REPLY
                       MOVE COM-REPLY(1:WBCLI-RESPONSE-BODY-LEN)
                         TO ERROR-MESSAGE
                   ELSE
                       STRING  'HTTP ERROR=' WBCLI-HTTP-STATUS-CODE
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
      *  Terminate program.                                           *
      *---------------------------------------------------------------*
       EPILOG.

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
           
           SET ADDRESS OF COM-REPLY TO WBCLI-RESPONSE-BODY-PTR.
           
           PERFORM VARYING WS-I FROM 1 BY 1
                     UNTIL WS-I > WBCLI-RESPONSE-BODY-LEN
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
           
           DISPLAY 'CULTUREI STOPPING ==============================='.
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
       
       END PROGRAM CULTUREI.