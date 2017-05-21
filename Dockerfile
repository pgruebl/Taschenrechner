FROM picoded/tomcat
COPY ./target/Taschenrechner.war webapps/
ENV MANAGER_USER=admin
ENV MANAGER_PASS=obafgkmrn
ENV UPLOAD_MAX=100000
EXPOSE 8080
