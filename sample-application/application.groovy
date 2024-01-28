@Library('poc') _

// node {
//     try {
//         def callLibraryTemplate = new poc.template.sample()
//         callLibraryTemplate.call(
//             repo_url: "https://github.com/iamhritik/poc-repo.git",
//             repo_branch: "master",
//             repo_creds: "github-creds",
//             // message: "From shared library POC"
//         )
//         def callLibraryTemplate = new poc.template.sample()
//         callLibraryTemplate.call2(
//             // repo_url: "https://github.com/iamhritik/poc-repo.git",
//             // repo_branch: "master",
//             // repo_creds: "github-creds",
//             message: "From shared library POC"
//         )

//         call2
//     }
//     catch (Exception e){
//         currentBuild.result = "FAILURE"
//         echo "Faced some issue in the pipeline"
//     }
// }

pipeline {
    stages {
        stage("testing shared library") {
            script {
                    try {
                        def callLibraryTemplate = new poc.template.sample()
                        callLibraryTemplate.call(
                            repo_url: "https://github.com/iamhritik/poc-repo.git",
                            repo_branch: "master",
                            repo_creds: "github-creds",
                            // message: "From shared library POC"
                        )
                    }
                    catch (Exception e){
                        currentBuild.result = "FAILURE"
                        echo "Faced some issue in the pipeline"
                    }
            }
        }
    }
}