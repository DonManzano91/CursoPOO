from carro import Carro #A pesar del erro esta corriendo e importa la clase
if __name__ == "__main__":
    print("Bienvenido al curso de POO de platzi, Python version")
    carro = Carro()
    carro.license = "RDS4922"
    carro.driver = "Alejandro Manzano"
    carro.pasajero = 3
    print(vars(carro))