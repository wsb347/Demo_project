import axios from "axios";
import useApiAddress from "../api-address";
const useSignIn = () => {
  const apiAddress = useApiAddress();
  return async ({ loginId, logicPw, nickname }) => {
    const axiosResult = await axios({
      method: "post",
      url: `${apiAddress}/users/signup`,
      data: { loginId, logicPw, nickname },
    });
    // window.localStorage.setItem('token',axiosResult.data.token);
  };
};

export default useSignIn;
