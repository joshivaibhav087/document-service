package com.delta.document

import com.delta.document.dao.PolicyHolderDao
import com.delta.document.model.PolicyHolder
import com.delta.document.repository.PolicyHolderRepository
import com.delta.document.service.PolicyService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import java.net.URI

import java.util.*


@SpringBootTest
open class DocumentServiceApplicationTests() {

    @Autowired
    var policyService: PolicyService? = null

    @MockBean
    var policyHolderRepository: PolicyHolderRepository? = null




   
  
   


    //@Test
    //fun getDetailsByIdTest(){
       // val date = Date()
//        var d2 = PolicyHolder()
//        d2.partnerId = "6"
//        d2.clientName = "vaibhav"
//        d2.clientAddress = "mumbai"
//        d2.pinCode = "400706"
//        d2.emailId = "ani@gmail.com"
//        d2.mobile = "7162986"
//        d2.birthDate = date
//        d2.aadharNumber = "12345"
//        d2.aadharURL = "ani.pdf"
//        d2.panCardNumber = "09876"
//        d2.panCardURL ="0987654"

//        Mockito.`when`(policyHolderRepository!!.findById())
//            .thenReturn(listOf(d2))
//        Assertions.assertEquals(1,policyService!!.getDerailsByPanCardNumber().size);
//    }

}

