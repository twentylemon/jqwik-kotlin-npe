Minimal repo showing error from https://github.com/jqwik-team/jqwik/issues/557

### running

```
mvn clean install
```

### showing the error

Uncomment in [pom](https://github.com/twentylemon/jqwik-kotlin-npe/blob/main/pom.xml#L41-L46) the `jqwik-kotlin` dependency, and run `mvn clean install` again.
