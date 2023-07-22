import React from "react";
import NavMenu from "../../components/nav-menu";
import PortfolioCarousel from "./fragements/portfolio-carousel";
import Scheduler from "./fragements/scheduler";
import useLogic from "./use-logic";
import classNames from "classnames/bind";
import styles from "./main-page.module.scss";
const ss = classNames.bind(styles);

const MainPage = () => {
  const logic = useLogic();
  return (
    <div className={ss("wrapper")}>
      <NavMenu logic={logic} />
      <div className={ss("main")}>
        <PortfolioCarousel />
        <Scheduler />
      </div>
    </div>
  );
};

export default MainPage;
