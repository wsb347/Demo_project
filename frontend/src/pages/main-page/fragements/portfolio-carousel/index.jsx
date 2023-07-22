import React from "react";
import classNames from "classnames/bind";
import Carousel from "react-multi-carousel";
import styles from "./portfolio-carousel.module.scss";
import "react-multi-carousel/lib/styles.css";
const ss = classNames.bind(styles);

const PortfolioCarousel = () => {
  const responsive = {
    superLargeDesktop: {
      // the naming can be any, depends on you.
      breakpoint: { max: 4000, min: 3000 },
      items: 3,
    },
    desktop: {
      breakpoint: { max: 3000, min: 1024 },
      items: 2,
    },
    tablet: {
      breakpoint: { max: 1024, min: 464 },
      items: 2,
    },
    mobile: {
      breakpoint: { max: 464, min: 0 },
      items: 2,
    },
  };
  return (
    <div className={ss("wrapper")}>
      <Carousel responsive={responsive}>
        <div>1</div>
        <div>2</div>
        <div>3</div>
        <div>4</div>
        {/* <div className={ss("list", "item1")}>Item 1</div>
        <div className={ss("list", "item2")}>Item 2</div>
        <div className={ss("list", "item3")}>Item 3</div>
        <div className={ss("list", "item4")}>Item 4</div> */}
      </Carousel>
    </div>
  );
};

export default PortfolioCarousel;
