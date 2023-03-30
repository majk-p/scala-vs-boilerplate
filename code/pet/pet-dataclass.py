from dataclasses import dataclass

@dataclass()
class Pet:
  name: str
  owner: str

doge = Pet("Doge", "Adam")

doge.name = 128

print(doge)