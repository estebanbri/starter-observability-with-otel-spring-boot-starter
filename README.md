# POC Observabilidad con opentelemetry-spring-boot-starter
Dependencias requeridas:
- opentelemetry-spring-boot-starter
- spring-boot-starter-actuator

Nota: actuator es obligatorio si y solo si necesitas agregar métricas a tu app. Actuator automáticamente
configura behind the scenes a micrometer como generador de métricas, es decir no tenes que agregar
manualmente a micrometer ya la dependencia de actuator se encarga de esto.