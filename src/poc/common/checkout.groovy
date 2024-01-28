package poc.common

def gitCheckout(Map stepParams){
    stage('Git Checkout'){
      echo 'Performing Git Checkout'
      repo_url = "${stepParams.repo_url}"
      repo_branch = "${stepParams.repo_branch}"
      repo_creds = "${stepParams.repo_creds}"
      git branch: "${repo_branch}", credentialsId: "${repo_creds}", url: "${repo_url}"        
    }
}