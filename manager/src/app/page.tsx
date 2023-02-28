"use client";
import { authenticate } from "@/modules/auth/services/authService";
import HomeStyle from "../styles/page.module.css";

const Home = () => {
  const logIn = async (flag: string) => {
    console.log(flag);
    await authenticate(flag)
      .then((res) => {
        console.log(res);
      })
      .catch((err) => {
        console.log(err);
      });
  };

  return (
    <div className={HomeStyle.home}>
      <div className="d-flex flex-column justify-content-center w-100 h-100">
        <div className="d-flex flex-column justify-content-center align-items-center">
          <h1 className="fw-light text-white m-0">
            Hello, Welcome To Book Store Management System
          </h1>
          <div className="btn-group mt-5 mb-1">
            <button
              className="btn btn-outline-light"
              onClick={() => {
                logIn("google");
              }}
            >
              Log In With Google
            </button>
          </div>
          <div className="btn-group mb-5">
            <button
              className="btn btn-outline-light"
              onClick={() => {
                logIn("github");
              }}
            >
              Log In With Github
            </button>
          </div>
          <div>
            <h5 className="fw-light text-white m-0">— Develop by @tanhaok —</h5>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
