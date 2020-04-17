class carroTipoA extends Carro2{ /*Esta es la forma en la que se declara una clase en js*/

    constructor(license, driver, brand, model){
        super(license, driver)
        this.brand = brand
        this.model = model
    }
    
}