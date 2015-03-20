# spring-boot-2692
Issue demonstration for spring-boot #2692.

Throwing a `RuntimeException` from a controller method should cause Spring
to intercept and execute the error handler for 500. Instead, on Undertow,
exceptions that are `RuntimeException`s but do not contain custom
`@ResponseStatus` annotations don't get handled by Spring MVC.
I suspect a classloader issue causing different copies of `RuntimeException`,
but that's just an offhand hunch, since the behavior doesn't replicate on Tomcat.

## To demonstrate:

[http://localhost:8080/nothinghere]
[http://localhost:8080/throw/customWith]
[http://localhost:8080/throw/customWithout]
[http://localhost:8080/throw/runtime]