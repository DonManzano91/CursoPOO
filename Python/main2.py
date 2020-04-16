from carro2 import Carro2 #A pesar del erro esta corriendo e importa la clase
from cuenta2 import Cuenta2

if __name__ == "__main__":
    print("Bienvenido al curso de POO de platzi, Python version")
    
    carro2 = Carro2("rte3789", Cuenta2("Alejnadro", "RDF8965"))
    print(vars(carro2))
    print(vars(carro2.driver))