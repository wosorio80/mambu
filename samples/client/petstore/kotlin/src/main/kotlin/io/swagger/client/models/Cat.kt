/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models

import io.swagger.client.models.Category
import io.swagger.client.models.Pet
import io.swagger.client.models.Tag

/**
 * 
 * @param id 
 * @param category 
 * @param name 
 * @param photoUrls 
 * @param tags 
 * @param status pet status in the store
 * @param hunts 
 * @param age 
 */
data class Cat (

    val id: kotlin.Long? = null,
    val category: Category? = null,
    val name: kotlin.String,
    val photoUrls: kotlin.Array<kotlin.String>,
    val tags: kotlin.Array<Tag>? = null,
    /* pet status in the store */
    val status: Cat.Status? = null,
    val hunts: kotlin.Boolean? = null,
    val age: kotlin.Int? = null
) {
    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String){
        available("available"),
        pending("pending"),
        sold("sold");
    }
}