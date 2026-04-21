from personaje import Personaje

equipo = [None] * 5

equipo[0] = Personaje("Thor", 10, 120)
equipo[1] = Personaje("Merlin", 8, 90)

for p in equipo:
    if p is not None and p.nivel < 10:
        p.subir_nivel()
    print(p)
