import { useEffect } from 'react';
import { useState } from 'react';
import { fetchData } from './../helpers/fetchData';

export const useFetchData = (endPoint) => {

  const [data, setData] = useState([])
  const [isLoading, setIsLoading] = useState(true)  

  useEffect(() => {
    fetchData(endPoint)
    .then(res => {
      setData(res.data)
      setIsLoading(res.isLoading)
    })
  }, [endPoint])

  return {
    data,
    isLoading
  }
};
