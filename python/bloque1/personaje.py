class Personaje:
    def __init__(self, nombre, nivel, hp):
        self.nombre = nombre
        self.nivel = nivel
        self.hp = hp

    def subir_nivel(self):
        self.nivel += 1
        self.hp += 10

    def __str__(self):
        return f'[Nv.{self.nivel}] {self.nombre} | HP:{self.hp}'
