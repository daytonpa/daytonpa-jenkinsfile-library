#!/groovy

// This function will accept 4 values for running tests
// 1) none --> don't do a thing
// 2) unit --> only run RSpec unit tests
// 3) int  --> only run InSpec integration tests
// 4) all  --> yes

def call(String tests = 'none') {
    if (tests == 'unit' || tests == 'all') {
        sh 'chef exec rspec -fd'
    }
    if (tests == 'int' || tests == 'all') {
        sh 'kitchen verify'
    }
    if ('none') {
        echo 'Skipping tests...'
    }
}