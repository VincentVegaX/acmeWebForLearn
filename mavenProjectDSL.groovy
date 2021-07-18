job('automatingJenkinsJob')
    {
        description('to generate a maven build job on jenkins')
        scm{
                git("https://github.com/dhub26/https-github.com-anshulc55-Jenkins_Upgradev3.git", master)
            }
        triggers{
            scm('* * * * *')
        }    
        steps{
            maven('clean package', 'maven-samples/single-module/')
        }
        publishers{
            archiveArtifacts '**/*.jar'
        }
    }