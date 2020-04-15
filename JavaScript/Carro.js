function Carro(license, driver){
    this.id
    this.license = license;
    this.driver = driver;
    this.pasajero
}

Carro.prototype.imprimeDatosCarro = function(){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}