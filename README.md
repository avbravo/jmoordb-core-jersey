
# JMoordb-core-jersey

Framework Java para bases de datos NoSQL

Esta implementación de jmoordb-core utiliza la libreria
```xml

 <dependency>
            <groupId>org.glassfish.jersey.core</groupId>
            <artifactId>jersey-common</artifactId>
            <!--<version>3.1.0</version>-->
            <version>3.0.8</version>
            <!--<version>3.1.0-M3</version>-->
            <type>jar</type>
        </dependency>

```

y ofrece una clase para hacer encode llamada JerseyEncode.
Tenga presente que algunas versiones de Jersey generar errores al usarse con Quarkus o Arquillian.

