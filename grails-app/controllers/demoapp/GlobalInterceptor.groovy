package demoapp

import org.springframework.http.HttpMethod


class GlobalInterceptor {

	GlobalInterceptor() {
		println "GlobalInterceptor()"
		matchAll()
			.excludes(uri: '/favicon.ico')
	}

    boolean before() {
		println "[$request.method] GlobalInterceptor.before()"

		true
	}

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
