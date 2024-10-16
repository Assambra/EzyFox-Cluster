:: set EZYFOX_SERVER_HOME=
mvn -pl . clean install & ^
mvn -pl ezyfox-cluster-common -Pexport clean install & ^
mvn -pl ezyfox-cluster-app-api -Pexport clean install & ^
mvn -pl ezyfox-cluster-app-entry -Pexport clean install & ^
mvn -pl ezyfox-cluster-plugin -Pexport clean install & ^
copy ezyfox-cluster-zone-settings.xml %EZYFOX_SERVER_HOME%/settings/zones/
