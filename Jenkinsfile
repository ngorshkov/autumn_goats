pipeline {
    agent any

    tools {
        jdk "jenkin_jdk"
        maven "maven_jenkins"
    }

    parameters {
        choice(choices: ["stand1", "stand2", "stand3"], description: "выбери свой стенд", name: "stands")
        booleanParam(defaultValue: true, description: "run UI tests", name: "go")
        booleanParam(defaultValue: false, description: "run BE tests", name: "no")
    }

    stages {
        stage("UI tests") {
            when {
                expression { return params.go }
            }
            steps {

                sh "mvn -Dtest=ui.** verify"
            }
        }
    }

    post {
        always {
            allure([
                reportBuildPolicy: "ALWAYS",
                results: [[path: 'target/allure-results']]
            ])
        }
    }

}