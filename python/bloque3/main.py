from personaje import Personaje

gremio = [
    Personaje("Thor", 10, 120),
    Personaje("Merlin", 8, 90)
]

total_hp = sum(p.hp for p in gremio)
print(total_hp)
