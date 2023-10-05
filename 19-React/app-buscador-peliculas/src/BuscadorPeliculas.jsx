import { useState } from "react"

export const BuscadorPeliculas = () => {

    const urlBase = 'https://api.themoviedb.org/3/search/movie'
    const API_KEY = '26763bf2f052fdb09f624c33c9207566'

    const [busqueda, setBusqueda] = useState('')
    const [peliculas, setPeliculas] = useState([])

    const handleInputChange = (e) => {
        setBusqueda(e.target.value)
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        fetchPeliculas()
    }

    const fetchPeliculas = async () => {
        try {
            const response = await fetch(`https://api.themoviedb.org/3/search/movie?api_key=${API_KEY}&query=${busqueda}`);
            //`https://api.themoviedb.org/3/search/movie?api_key=${API_KEY}&query=${query}`
            const data = await response.json()
            setPeliculas(data.results)
        } catch (error) {
            console.error('Ha ocurrido un error: ', error)
        }
    }


    return (
        <div className="container">

            <h1 className="title">Buscador de peliculas</h1>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Escribi una pelicula"
                    value={busqueda}
                    onChange={handleInputChange}
                />
                <button type="submit" className="search-button">Buscar</button>
            </form>

            <div className="movie-list">
                {peliculas.map((pelicula) => (
                    <div key={pelicula.id} className="movie-card">
                        <img src={`https://image.tmdb.org/t/p/w500/${pelicula.poster_path}`} alt={pelicula.title} className="movie-poster" />
                        <h2 className="movie-title">{pelicula.title}</h2>
                        <p className="movie-release-date">{pelicula.release_date}</p>
                        <p className="movie-overview">{pelicula.overview}</p>
                    </div>
                ))}
            </div>
        </div>



    )
}