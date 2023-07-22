import React from "react";
import NavMenu from "../../components/nav-menu";
import useLogic from "./use-logic";

const SignInPage = () => {
  const logic = useLogic();

  return (
    <div>
      <label>
        메일을 입력해주세요
        <input
          type="mail"
          name="userMail"
          id="userMail"
          onChange={(e) => {
            logic.setUserMail(e.target.value);
          }}
        />
      </label>
      <label>
        아이디를 입력해주세요
        <input
          type="text"
          name="userId"
          id="userId"
          onChange={(e) => {
            logic.setUserId(e.target.value);
          }}
        />
      </label>
      <label>
        비밀번호를 입력해주세요
        <input
          type="password"
          name="userPw"
          id="userPw"
          onChange={(e) => {
            logic.setUserPw(e.target.value);
          }}
        />
      </label>
      <label>
        이름을 입력해주세요
        <input
          type="text"
          name="userName"
          id="userName"
          onChange={(e) => {
            logic.setUserName(e.target.value);
          }}
        />
      </label>
      <label>
        사진을 업로드 해주세요
        <input
          type="file"
          name="userName"
          id="userName"
          onChange={(e) => {
            logic.setUserPhoto(e.target.value);
          }}
        />
      </label>
      <div onClick={logic.onSubmit}>회원가입</div>
    </div>
  );
};

export default SignInPage;
