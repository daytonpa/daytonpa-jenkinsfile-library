#!/groovy

def call(String branch = 'not-set') {
    def env
    if (branch == 'master') {
        env = 'production'
    } else if (branch == 'qa') {
        env = 'qa'
    } else if (branch == 'staging') {
        env = 'staging'
    } else {
        env = 'development'
    }
    return env
}