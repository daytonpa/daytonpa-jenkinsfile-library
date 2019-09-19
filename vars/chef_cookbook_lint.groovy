#!/groovy

// Perform some linting.  Verify you have a rubocop.yml
// file and a .foodcritic file inside your cookbook 
// directory.

def call() {
    sh 'chef exec foodcritic .' 
    sh 'chef exec rubocop .'
}