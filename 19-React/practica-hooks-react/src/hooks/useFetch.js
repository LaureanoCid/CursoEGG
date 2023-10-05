import { useEffect, useState } from "react"

export const useFetch = (url) => {

    const [state, setState] = useState({
        data: null,
        isLoading: true,
        error: null
    })

    const {data, isLoading, error} = state

    const getFetch = async() => {
        
       
       try {
        const response = await fetch(url)
        const data = await response.json()
        setState({
            data,
            isLoading: false,
            error: null
           })
       } catch (error) {
        setState({
            data,
            isLoading: false,
            error: error
           })
       }       
    }

    useEffect(() => {
        if (!url) return
        getFetch()
    }, [url])
    

  return {
    data,
    isLoading,
    error
  }
}
