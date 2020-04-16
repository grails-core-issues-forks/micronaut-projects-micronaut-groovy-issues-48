package example.micronaut.entities

import grails.gorm.annotation.Entity
import org.bson.types.ObjectId
import org.grails.datastore.gorm.GormEntity

@Entity
class SomeEntity implements GormEntity<SomeEntity> {

    ObjectId id
    String something

    static constraints = {
        something nullable: false
    }
}
