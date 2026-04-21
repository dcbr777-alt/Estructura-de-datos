from personaje import Personaje

gremio = [
    Personaje("Thor", 10, 120),
    Personaje("Frodo", 3, 50)
]

for p in gremio:
    if p.nivel < 5:
        print(f'Inactivado: {p.nombre}')
