# Usa imagem oficial do Tomcat com Java 17
FROM tomcat:10.1-jdk17-temurin

# Remove a aplicação padrão do Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copia seu WAR para a pasta do Tomcat com o nome ROOT.war
COPY target/com.grupoflorindo.apps.contagem-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
