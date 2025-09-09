package fake

import org.example.IPetRepository
import org.example.Pet

class MainFake {

    class PetRepositoryFake : IPetRepository {
        private var _storage = mutableListOf<Pet>()

        override fun create(pet: Pet): Pet {

            if(_storage.size < 1) pet.id = 1 else pet.id = _storage.size

            _storage.add(pet)

            return _storage.last()
        }

        override fun findById(id: Int): Pet? {
            return _storage.firstOrNull { it.id == id }
        }
    }


}