package ma.emsi.pokemon.retrofit;

import io.reactivex.Observable;
import ma.emsi.pokemon.modele.Pokedex;
import retrofit2.http.GET;


public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
