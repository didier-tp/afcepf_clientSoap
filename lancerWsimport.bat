set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_144
set WSDL_URL=http://localhost:8080/serverSoap/ws/tva?wsdl

cd /d "%~dp0"

"%JAVA_HOME%\bin\wsimport" -d src/main/java -keep %WSDL_URL%
pause

REM  open with / text editor pour editer ce fichier sous eclipse
REM  open with / system editor pour lancer sous eclipse et windows
REM  + refresh eclipse