import { useEffect, useState } from "react";

const useLogic = () => {
  const [isLoggedin, setIsLoggedIn] = useState(false);
  //   const init = async () => {};
  //   useEffect(() => {
  //     init();
  //   }, []);
  return {
    isLoggedin,
    setIsLoggedIn,
  };
};

export default useLogic;
