import axios from "axios";
import useApiAddress from "../api-address";
const useSignIn = () => {
  const apiAddress = useApiAddress();
  return async ({ email, password, name, id }) => {
    const axiosResult = await axios({
      method: "post",
      url: `${apiAddress}/users/signup`,
      data: { email, password, name, id },
    });
    // window.localStorage.setItem('token',axiosResult.data.token);
  };
};

export default useSignIn;
