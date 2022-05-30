package demoapp

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class GlobalInterceptorSpec extends Specification implements InterceptorUnitTest<GlobalInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test global interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"global")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
