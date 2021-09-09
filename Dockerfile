FROM java:8

ADD target/JavaBatch.jar app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]

