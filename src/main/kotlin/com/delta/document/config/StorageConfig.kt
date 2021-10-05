package com.delta.document.config

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class StorageConfig {

    private val accessKey = "AKIA4WSVA7DZI2ZOQGU7"


    private val accessSecret = "8L2LixjRAEVwHsymIckFbyiSwHEaNXY54ENhXSiY"


    private val region = "us-east-2"

    @Bean
    open fun s3Client(): AmazonS3 {
        val credentials: AWSCredentials = BasicAWSCredentials(accessKey, accessSecret)
        return AmazonS3ClientBuilder.standard()
            .withCredentials(AWSStaticCredentialsProvider(credentials))
            .withRegion(region).build()
    }
}