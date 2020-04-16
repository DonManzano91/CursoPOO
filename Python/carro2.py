from cuenta2 import Cuenta2

class Carro2:
    id = int
    license = str
    driver = Cuenta2("","")
    pasajero = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver