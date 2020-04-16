package example.micronaut

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import org.grails.datastore.mapping.config.ConfigurationBuilder

import java.lang.reflect.Field

@CompileStatic
class Application {
    static void main(String[] args) {
        Field field = ConfigurationBuilder.class.getDeclaredField('IGNORE_METHODS')
        field.setAccessible(true)
        ((Set) field.get(null)).add('autoEncryptionSettings')

        Micronaut.run(Application)
    }
}