from carro import Carro
class carroTipoA(Carro):
    tipoCarroAceptado = []
    materialAsientos = []

    def __init__(self, license, driver, tipoCarroAceptado,  materialAsientos):
        super.__init__(license, driver)
        self.tipoCarroAceptado = tipoCarroAceptado
        self.materialAsientos = materialAsientos