class carroTipoC extends Carro2{ /*Esta es la forma en la que se declara una clase en js*/

    constructor(license, driver, tipoCarroAceptado, asientosMaterial){
        super(license, driver)
        this.tipoCarroAceptado = tipoCarroAceptado
        this.asientosMaterial = asientosMaterial
    }
    
}