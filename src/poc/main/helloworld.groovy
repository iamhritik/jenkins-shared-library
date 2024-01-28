package poc.main

def helloWorldMessage(Map stepParams){
    stage('Print Hello World'){
        message = "${stepParams.message}"
        echo "Hello world ... ${message}"
    }
}