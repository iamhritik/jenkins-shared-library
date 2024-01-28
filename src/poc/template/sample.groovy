package poc.template

import poc.common.*
import poc.main.*

def call(Map stepParams){
    git_checkout = new checkout()
    printMessage = new helloworld()

    git_checkout.gitCheckout(
        repo_url: "${stepParams.repo_url}"
        repo_branch: "${stepParams.repo_branch}"
        repo_creds: "${stepParams.repo_creds}"
    )

    printMessage.helloWorldMessage(
        message: "${stepParams.message}"
    )
}
