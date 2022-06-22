package com.qomolangma.frameworks.bean.core

import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@Configuration
@EnableScheduling
@EnableAsync
class ApplicationBean {
    @Bean
    fun exceptionTranslator(messageSource: MessageSource?): ExceptionTranslator {
        return ExceptionTranslator(SpringMessageResolver(messageSource!!))
    }
}