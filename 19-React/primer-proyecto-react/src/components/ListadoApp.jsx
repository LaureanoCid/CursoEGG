import { useState } from "react"
import { AgregarTarea } from "./AgregarTarea"

const Items = ({ nombre, visto }) => {
    return (
        <li>{nombre}
            {visto ? '✅' : '❌'}</li>
    )
}

export const ListadoApp = () => {

    const addTask = () => {
        setArreglo([...arreglo, {nombre: 'nuevo', visto: false}])
    }

    let listadoSecciones = [
        { id:1 ,nombre: "Instalaciones necesarias", visto: true },
        { id:2 ,nombre: "Uso de Vite", visto: true },
        { id:3 ,nombre: "Componentes", visto: true },
        { id:4 ,nombre: "Variables en JSX", visto: true },
        { id:5 ,nombre: "Props", visto: true },
        { id:6 ,nombre: "Eventos", visto: true },
        { id:7 ,nombre: "useState", visto: true },
        { id:8 ,nombre: "Redux", visto: false },
        { id:9 ,nombre: "customHooks", visto: false }
    ]

    const [arreglo, setArreglo] = useState(listadoSecciones)

    const onAgregarTarea = (val) => {
        let valor = val.trim()
        if (valor < 1) return        
        const envio = {
            id : arreglo.length + 1,
            nombre : valor,
            visto : false
        }
        setArreglo([...arreglo, envio])
    }

    return (
        <>
            <AgregarTarea agregarTarea={onAgregarTarea}></AgregarTarea>
            <h1>Listado de temas del curso</h1>
            <ol>
                {arreglo.map(item => <Items key={item.id} nombre={item.nombre} visto={item.visto}></Items>)}
            </ol>
            
        </>
    )
}