import axios from "axios";
import useApiAddress from "../api-address";

const useHelloBackend = () => {
  const apiAddress = useApiAddress();

  return async () => {
    const axiosResult = await axios({
      method: "get",
      url: `${apiAddress}/hello`,
    });
    const result = axiosResult.data;
    return result;
  };
};

export default useHelloBackend;
