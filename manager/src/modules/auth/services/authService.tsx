import axios from "axios"

export const authenticate =async (flag: string) => {
    return await axios.get(`/authenticate/${flag}`) 
} 